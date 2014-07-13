/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.emftext.language.textAML3.resource.textAML3.debug;

/**
 * DebugMessages are exchanged between the debug server (the Eclipse debug
 * framework) and the debug client (a running process or interpreter). To exchange
 * messages they are serialized and sent over sockets.
 */
public class TextAML3DebugMessage {
	
	private static final char DELIMITER = ':';
	private org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes messageType;
	private String[] arguments;
	
	public TextAML3DebugMessage(org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes messageType, String[] arguments) {
		super();
		this.messageType = messageType;
		this.arguments = arguments;
	}
	
	public TextAML3DebugMessage(org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes messageType, java.util.List<String> arguments) {
		super();
		this.messageType = messageType;
		this.arguments = new String[arguments.size()];
		for (int i = 0; i < arguments.size(); i++) {
			this.arguments[i] = arguments.get(i);
		}
	}
	
	public org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes getMessageType() {
		return messageType;
	}
	
	public String[] getArguments() {
		return arguments;
	}
	
	public String serialize() {
		java.util.List<String> parts = new java.util.ArrayList<String>();
		parts.add(messageType.name());
		for (String argument : arguments) {
			parts.add(argument);
		}
		return org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.encode(DELIMITER, parts);
	}
	
	public static TextAML3DebugMessage deserialize(String response) {
		java.util.List<String> parts = org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.decode(response, DELIMITER);
		String messageType = parts.get(0);
		String[] arguments = new String[parts.size() - 1];
		for (int i = 1; i < parts.size(); i++) {
			arguments[i - 1] = parts.get(i);
		}
		org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes type = org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes.valueOf(messageType);
		TextAML3DebugMessage message = new TextAML3DebugMessage(type, arguments);
		return message;
	}
	
	public boolean hasType(org.emftext.language.textAML3.resource.textAML3.debug.ETextAML3DebugMessageTypes type) {
		return this.messageType == type;
	}
	
	public String getArgument(int index) {
		return getArguments()[index];
	}
	
	public String toString() {
		return this.getClass().getSimpleName() + "[" + messageType.name() + ": " + org.emftext.language.textAML3.resource.textAML3.util.TextAML3StringUtil.explode(arguments, ", ") + "]";
	}
	
}
