/**
 */
package textualmcrl2;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see textualmcrl2.Textualmcrl2Factory
 * @model kind="package"
 * @generated
 */
public interface Textualmcrl2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "textualmcrl2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://mdse.tue.nl/textualmcrl2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "textualmcrl2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Textualmcrl2Package eINSTANCE = textualmcrl2.impl.Textualmcrl2PackageImpl.init();

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SpecificationImpl <em>Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SpecificationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSpecification()
	 * @generated
	 */
	int SPECIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Atoms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__ATOMS = 0;

	/**
	 * The feature id for the '<em><b>Processes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__PROCESSES = 1;

	/**
	 * The feature id for the '<em><b>Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__SORTS = 2;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__OPERATIONS = 3;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__EQUATIONS = 4;

	/**
	 * The feature id for the '<em><b>Init</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__INIT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION__NAME = 6;

	/**
	 * The number of structural features of the '<em>Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIFICATION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.NameableImpl <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.NameableImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNameable()
	 * @generated
	 */
	int NAMEABLE = 42;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SortImpl <em>Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SortImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSort()
	 * @generated
	 */
	int SORT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT__NAME = NAMEABLE__NAME;

	/**
	 * The number of structural features of the '<em>Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ExpressionSortImpl <em>Expression Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ExpressionSortImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getExpressionSort()
	 * @generated
	 */
	int EXPRESSION_SORT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SORT__NAME = SORT__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SORT__EXPRESSION = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Expression Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.StructureSortImpl <em>Structure Sort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.StructureSortImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getStructureSort()
	 * @generated
	 */
	int STRUCTURE_SORT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SORT__NAME = SORT__NAME;

	/**
	 * The feature id for the '<em><b>Constructors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SORT__CONSTRUCTORS = SORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Structure Sort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRUCTURE_SORT_FEATURE_COUNT = SORT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ConstraintElementImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstraintElement()
	 * @generated
	 */
	int CONSTRAINT_ELEMENT = 62;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT__CONSTRAINTVAR = 0;

	/**
	 * The number of structural features of the '<em>Constraint Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SortExprImpl <em>Sort Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SortExprImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSortExpr()
	 * @generated
	 */
	int SORT_EXPR = 4;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPR__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Sort Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_EXPR_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BoolImpl <em>Bool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BoolImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBool()
	 * @generated
	 */
	int BOOL = 5;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Bool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.PosImpl <em>Pos</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.PosImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getPos()
	 * @generated
	 */
	int POS = 6;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Pos</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POS_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.NatImpl <em>Nat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.NatImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNat()
	 * @generated
	 */
	int NAT = 7;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Nat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAT_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.IntImpl <em>Int</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.IntImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getInt()
	 * @generated
	 */
	int INT = 8;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Int</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.RealImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getReal()
	 * @generated
	 */
	int REAL = 9;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ListImpl <em>List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ListImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getList()
	 * @generated
	 */
	int LIST = 10;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Element Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST__ELEMENT_SORT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SetImpl <em>Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SetImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSet()
	 * @generated
	 */
	int SET = 11;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Element Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET__ELEMENT_SORT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BagImpl <em>Bag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BagImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBag()
	 * @generated
	 */
	int BAG = 12;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Element Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG__ELEMENT_SORT = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SortRefImpl <em>Sort Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SortRefImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSortRef()
	 * @generated
	 */
	int SORT_REF = 13;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_REF__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Sortname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_REF__SORTNAME = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_REF__LINKS = SORT_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_REF__SORT = SORT_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sort Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORT_REF_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.HigherOrderImpl <em>Higher Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.HigherOrderImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getHigherOrder()
	 * @generated
	 */
	int HIGHER_ORDER = 14;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_ORDER__CONSTRAINTVAR = SORT_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_ORDER__DOMAIN = SORT_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_ORDER__RESULT = SORT_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Higher Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIGHER_ORDER_FEATURE_COUNT = SORT_EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ConstructorImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstructor()
	 * @generated
	 */
	int CONSTRUCTOR = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Projections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__PROJECTIONS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR__DISCRIMINATOR = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRUCTOR_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ProjectionImpl <em>Projection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ProjectionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProjection()
	 * @generated
	 */
	int PROJECTION = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION__DOMAIN = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Projection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTION_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.OpImpl <em>Op</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.OpImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getOp()
	 * @generated
	 */
	int OP = 17;

	/**
	 * The feature id for the '<em><b>Ops</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__OPS = 0;

	/**
	 * The feature id for the '<em><b>Cons</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP__CONS = 1;

	/**
	 * The number of structural features of the '<em>Op</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OP_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.EqnImpl <em>Eqn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.EqnImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getEqn()
	 * @generated
	 */
	int EQN = 18;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQN__VARIABLES = 0;

	/**
	 * The feature id for the '<em><b>Equations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQN__EQUATIONS = 1;

	/**
	 * The number of structural features of the '<em>Eqn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQN_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.EquationImpl <em>Equation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.EquationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getEquation()
	 * @generated
	 */
	int EQUATION = 19;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__CONDITION = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__LEFT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION__RIGHT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Equation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUATION_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.AtomImpl <em>Atom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.AtomImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAtom()
	 * @generated
	 */
	int ATOM = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM__TYPE = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Atom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOM_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ProcessExprImpl <em>Process Expr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ProcessExprImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcessExpr()
	 * @generated
	 */
	int PROCESS_EXPR = 21;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EXPR__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Process Expr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_EXPR_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.AtomicActionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAtomicAction()
	 * @generated
	 */
	int ATOMIC_ACTION = 22;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Atomname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ATOMNAME = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__LINKS = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION__ARGUMENTS = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Atomic Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_ACTION_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.DeadlockImpl <em>Deadlock</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.DeadlockImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getDeadlock()
	 * @generated
	 */
	int DEADLOCK = 23;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Deadlock</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEADLOCK_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.TauImpl <em>Tau</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.TauImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getTau()
	 * @generated
	 */
	int TAU = 24;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAU__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Tau</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAU_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SummationImpl <em>Summation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SummationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSummation()
	 * @generated
	 */
	int SUMMATION = 25;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__PARAMETERS = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION__CHILD = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Summation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUMMATION_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BlockImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 26;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__CHILD = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atomnames</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ATOMNAMES = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__LINKS = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.AllowImpl <em>Allow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.AllowImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAllow()
	 * @generated
	 */
	int ALLOW = 27;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW__CHILD = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atomnames</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW__ATOMNAMES = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW__LINKS = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Allow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALLOW_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.HideImpl <em>Hide</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.HideImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getHide()
	 * @generated
	 */
	int HIDE = 28;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__CHILD = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Atomnames</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__ATOMNAMES = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE__LINKS = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Hide</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HIDE_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.RenameImpl <em>Rename</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.RenameImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getRename()
	 * @generated
	 */
	int RENAME = 29;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Child</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__CHILD = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Renamings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME__RENAMINGS = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.RenamingImpl <em>Renaming</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.RenamingImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getRenaming()
	 * @generated
	 */
	int RENAMING = 30;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Oldname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__OLDNAME = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Newname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__NEWNAME = CONSTRAINT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING__LINKS = CONSTRAINT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Renaming</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAMING_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.CommunicationImpl <em>Communication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.CommunicationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCommunication()
	 * @generated
	 */
	int COMMUNICATION = 31;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__COMMUNICATIONS = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION__ACTION = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Communication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.MultiActionImpl <em>Multi Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.MultiActionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getMultiAction()
	 * @generated
	 */
	int MULTI_ACTION = 32;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ACTION__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Actionnames</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ACTION__ACTIONNAMES = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Resultname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ACTION__RESULTNAME = CONSTRAINT_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ACTION__LINKS = CONSTRAINT_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Multi Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_ACTION_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.CompositeActionImpl <em>Composite Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.CompositeActionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCompositeAction()
	 * @generated
	 */
	int COMPOSITE_ACTION = 33;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION__LEFT = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_ACTION_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SynchronizationImpl <em>Synchronization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SynchronizationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSynchronization()
	 * @generated
	 */
	int SYNCHRONIZATION = 34;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Synchronization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYNCHRONIZATION_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.TimedActionImpl <em>Timed Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.TimedActionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getTimedAction()
	 * @generated
	 */
	int TIMED_ACTION = 35;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Timed Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMED_ACTION_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SequenceImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 36;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ImplicationImpl <em>Implication</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ImplicationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getImplication()
	 * @generated
	 */
	int IMPLICATION = 37;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__CONSTRAINTVAR = PROCESS_EXPR__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__CONDITION = PROCESS_EXPR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ACTION = PROCESS_EXPR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION__ELSE_ACTION = PROCESS_EXPR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Implication</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPLICATION_FEATURE_COUNT = PROCESS_EXPR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BoundedInitialisationImpl <em>Bounded Initialisation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BoundedInitialisationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBoundedInitialisation()
	 * @generated
	 */
	int BOUNDED_INITIALISATION = 38;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INITIALISATION__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INITIALISATION__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INITIALISATION__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bounded Initialisation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_INITIALISATION_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ParallelismImpl <em>Parallelism</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ParallelismImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getParallelism()
	 * @generated
	 */
	int PARALLELISM = 39;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELISM__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELISM__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELISM__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Parallelism</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARALLELISM_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.LeftMergeImpl <em>Left Merge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.LeftMergeImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getLeftMerge()
	 * @generated
	 */
	int LEFT_MERGE = 40;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MERGE__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MERGE__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MERGE__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Left Merge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_MERGE_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ChoiceImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 41;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CONSTRAINTVAR = COMPOSITE_ACTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LEFT = COMPOSITE_ACTION__LEFT;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__RIGHT = COMPOSITE_ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = COMPOSITE_ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.DataExpressionImpl <em>Data Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.DataExpressionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getDataExpression()
	 * @generated
	 */
	int DATA_EXPRESSION = 43;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION__CONSTRAINTVAR = CONSTRAINT_ELEMENT__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Data Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_EXPRESSION_FEATURE_COUNT = CONSTRAINT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.IdentifierImpl <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.IdentifierImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 44;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Varname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__VARNAME = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__LINKS = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.NumberImpl <em>Number</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.NumberImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 45;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER__VALUE = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BooleanLiteralImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBooleanLiteral()
	 * @generated
	 */
	int BOOLEAN_LITERAL = 46;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL__VALUE = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.CollectionImpl <em>Collection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.CollectionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCollection()
	 * @generated
	 */
	int COLLECTION = 47;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The number of structural features of the '<em>Collection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.SetEnumerationImpl <em>Set Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.SetEnumerationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSetEnumeration()
	 * @generated
	 */
	int SET_ENUMERATION = 48;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ENUMERATION__CONSTRAINTVAR = COLLECTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ENUMERATION__ELEMENTS = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Set Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_ENUMERATION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ListEnumerationImpl <em>List Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ListEnumerationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getListEnumeration()
	 * @generated
	 */
	int LIST_ENUMERATION = 49;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ENUMERATION__CONSTRAINTVAR = COLLECTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ENUMERATION__ELEMENTS = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>List Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIST_ENUMERATION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BagEnumerationImpl <em>Bag Enumeration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BagEnumerationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBagEnumeration()
	 * @generated
	 */
	int BAG_ENUMERATION = 50;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUMERATION__CONSTRAINTVAR = COLLECTION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUMERATION__ELEMENTS = COLLECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bag Enumeration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUMERATION_FEATURE_COUNT = COLLECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BagEnumElementImpl <em>Bag Enum Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BagEnumElementImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBagEnumElement()
	 * @generated
	 */
	int BAG_ENUM_ELEMENT = 51;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUM_ELEMENT__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUM_ELEMENT__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Bag Enum Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_ENUM_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.FunctionApplicationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getFunctionApplication()
	 * @generated
	 */
	int FUNCTION_APPLICATION = 52;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__BASE = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__ARGUMENTS = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION__LINKS = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_APPLICATION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.MapAccessImpl <em>Map Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.MapAccessImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getMapAccess()
	 * @generated
	 */
	int MAP_ACCESS = 53;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACCESS__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACCESS__BASE = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACCESS__KEY = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACCESS__VALUE = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Map Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAP_ACCESS_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.UnaryExpressionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getUnaryExpression()
	 * @generated
	 */
	int UNARY_EXPRESSION = 54;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__RIGHT = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION__OPERATION = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.QuantificationImpl <em>Quantification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.QuantificationImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getQuantification()
	 * @generated
	 */
	int QUANTIFICATION = 55;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__EXPRESSION = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__VARIABLE = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Forall</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION__FORALL = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quantification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFICATION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.IdDeclImpl <em>Id Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.IdDeclImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getIdDecl()
	 * @generated
	 */
	int ID_DECL = 56;

	/**
	 * The feature id for the '<em><b>Sort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DECL__SORT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DECL__NAME = 1;

	/**
	 * The number of structural features of the '<em>Id Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ID_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.BinaryExpressionImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBinaryExpression()
	 * @generated
	 */
	int BINARY_EXPRESSION = 57;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__OPERATOR = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Left</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__LEFT = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Right</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION__RIGHT = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Binary Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_EXPRESSION_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.LambdaImpl <em>Lambda</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.LambdaImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getLambda()
	 * @generated
	 */
	int LAMBDA = 58;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__EXPRESSION = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__VARIABLE = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA__LINKS = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Lambda</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LAMBDA_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.WhereClauseImpl <em>Where Clause</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.WhereClauseImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getWhereClause()
	 * @generated
	 */
	int WHERE_CLAUSE = 59;

	/**
	 * The feature id for the '<em><b>Constraintvar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__CONSTRAINTVAR = DATA_EXPRESSION__CONSTRAINTVAR;

	/**
	 * The feature id for the '<em><b>Base</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__BASE = DATA_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Values</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE__VALUES = DATA_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Where Clause</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHERE_CLAUSE_FEATURE_COUNT = DATA_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ProcessImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 60;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__PARAMETERS = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ProcessDeclImpl <em>Process Decl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ProcessDeclImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcessDecl()
	 * @generated
	 */
	int PROCESS_DECL = 61;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DECL__ACTION = 0;

	/**
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DECL__PROCESS = 1;

	/**
	 * The number of structural features of the '<em>Process Decl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_DECL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link textualmcrl2.impl.ConstraintVarImpl <em>Constraint Var</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.impl.ConstraintVarImpl
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstraintVar()
	 * @generated
	 */
	int CONSTRAINT_VAR = 63;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VAR__NUMBER = 0;

	/**
	 * The number of structural features of the '<em>Constraint Var</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_VAR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link textualmcrl2.UnaryOps <em>Unary Ops</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.UnaryOps
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getUnaryOps()
	 * @generated
	 */
	int UNARY_OPS = 64;

	/**
	 * The meta object id for the '{@link textualmcrl2.BinaryOps <em>Binary Ops</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see textualmcrl2.BinaryOps
	 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBinaryOps()
	 * @generated
	 */
	int BINARY_OPS = 65;


	/**
	 * Returns the meta object for class '{@link textualmcrl2.Specification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specification</em>'.
	 * @see textualmcrl2.Specification
	 * @generated
	 */
	EClass getSpecification();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Specification#getAtoms <em>Atoms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Atoms</em>'.
	 * @see textualmcrl2.Specification#getAtoms()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Atoms();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Specification#getProcesses <em>Processes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Processes</em>'.
	 * @see textualmcrl2.Specification#getProcesses()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Processes();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Specification#getSorts <em>Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sorts</em>'.
	 * @see textualmcrl2.Specification#getSorts()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Sorts();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Specification#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operations</em>'.
	 * @see textualmcrl2.Specification#getOperations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Operations();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Specification#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see textualmcrl2.Specification#getEquations()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Equations();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Specification#getInit <em>Init</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init</em>'.
	 * @see textualmcrl2.Specification#getInit()
	 * @see #getSpecification()
	 * @generated
	 */
	EReference getSpecification_Init();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Specification#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see textualmcrl2.Specification#getName()
	 * @see #getSpecification()
	 * @generated
	 */
	EAttribute getSpecification_Name();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Sort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort</em>'.
	 * @see textualmcrl2.Sort
	 * @generated
	 */
	EClass getSort();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ExpressionSort <em>Expression Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression Sort</em>'.
	 * @see textualmcrl2.ExpressionSort
	 * @generated
	 */
	EClass getExpressionSort();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.ExpressionSort#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see textualmcrl2.ExpressionSort#getExpression()
	 * @see #getExpressionSort()
	 * @generated
	 */
	EReference getExpressionSort_Expression();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.StructureSort <em>Structure Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Structure Sort</em>'.
	 * @see textualmcrl2.StructureSort
	 * @generated
	 */
	EClass getStructureSort();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.StructureSort#getConstructors <em>Constructors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constructors</em>'.
	 * @see textualmcrl2.StructureSort#getConstructors()
	 * @see #getStructureSort()
	 * @generated
	 */
	EReference getStructureSort_Constructors();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.SortExpr <em>Sort Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Expr</em>'.
	 * @see textualmcrl2.SortExpr
	 * @generated
	 */
	EClass getSortExpr();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Bool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool</em>'.
	 * @see textualmcrl2.Bool
	 * @generated
	 */
	EClass getBool();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Pos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pos</em>'.
	 * @see textualmcrl2.Pos
	 * @generated
	 */
	EClass getPos();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Nat <em>Nat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nat</em>'.
	 * @see textualmcrl2.Nat
	 * @generated
	 */
	EClass getNat();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Int <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int</em>'.
	 * @see textualmcrl2.Int
	 * @generated
	 */
	EClass getInt();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see textualmcrl2.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List</em>'.
	 * @see textualmcrl2.List
	 * @generated
	 */
	EClass getList();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.List#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Sort</em>'.
	 * @see textualmcrl2.List#getElementSort()
	 * @see #getList()
	 * @generated
	 */
	EReference getList_ElementSort();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set</em>'.
	 * @see textualmcrl2.Set
	 * @generated
	 */
	EClass getSet();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Set#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Sort</em>'.
	 * @see textualmcrl2.Set#getElementSort()
	 * @see #getSet()
	 * @generated
	 */
	EReference getSet_ElementSort();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Bag <em>Bag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag</em>'.
	 * @see textualmcrl2.Bag
	 * @generated
	 */
	EClass getBag();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Bag#getElementSort <em>Element Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element Sort</em>'.
	 * @see textualmcrl2.Bag#getElementSort()
	 * @see #getBag()
	 * @generated
	 */
	EReference getBag_ElementSort();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.SortRef <em>Sort Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sort Ref</em>'.
	 * @see textualmcrl2.SortRef
	 * @generated
	 */
	EClass getSortRef();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.SortRef#getSortname <em>Sortname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortname</em>'.
	 * @see textualmcrl2.SortRef#getSortname()
	 * @see #getSortRef()
	 * @generated
	 */
	EAttribute getSortRef_Sortname();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.SortRef#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.SortRef#getLinks()
	 * @see #getSortRef()
	 * @generated
	 */
	EReference getSortRef_Links();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.SortRef#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sort</em>'.
	 * @see textualmcrl2.SortRef#getSort()
	 * @see #getSortRef()
	 * @generated
	 */
	EAttribute getSortRef_Sort();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.HigherOrder <em>Higher Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Higher Order</em>'.
	 * @see textualmcrl2.HigherOrder
	 * @generated
	 */
	EClass getHigherOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.HigherOrder#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see textualmcrl2.HigherOrder#getDomain()
	 * @see #getHigherOrder()
	 * @generated
	 */
	EReference getHigherOrder_Domain();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.HigherOrder#getResult <em>Result</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Result</em>'.
	 * @see textualmcrl2.HigherOrder#getResult()
	 * @see #getHigherOrder()
	 * @generated
	 */
	EReference getHigherOrder_Result();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Constructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see textualmcrl2.Constructor
	 * @generated
	 */
	EClass getConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Constructor#getProjections <em>Projections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Projections</em>'.
	 * @see textualmcrl2.Constructor#getProjections()
	 * @see #getConstructor()
	 * @generated
	 */
	EReference getConstructor_Projections();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Constructor#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator</em>'.
	 * @see textualmcrl2.Constructor#getDiscriminator()
	 * @see #getConstructor()
	 * @generated
	 */
	EAttribute getConstructor_Discriminator();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Projection <em>Projection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projection</em>'.
	 * @see textualmcrl2.Projection
	 * @generated
	 */
	EClass getProjection();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Projection#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Domain</em>'.
	 * @see textualmcrl2.Projection#getDomain()
	 * @see #getProjection()
	 * @generated
	 */
	EReference getProjection_Domain();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Op <em>Op</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Op</em>'.
	 * @see textualmcrl2.Op
	 * @generated
	 */
	EClass getOp();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Op#getOps <em>Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ops</em>'.
	 * @see textualmcrl2.Op#getOps()
	 * @see #getOp()
	 * @generated
	 */
	EReference getOp_Ops();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Op#isCons <em>Cons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cons</em>'.
	 * @see textualmcrl2.Op#isCons()
	 * @see #getOp()
	 * @generated
	 */
	EAttribute getOp_Cons();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Eqn <em>Eqn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Eqn</em>'.
	 * @see textualmcrl2.Eqn
	 * @generated
	 */
	EClass getEqn();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Eqn#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see textualmcrl2.Eqn#getVariables()
	 * @see #getEqn()
	 * @generated
	 */
	EReference getEqn_Variables();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Eqn#getEquations <em>Equations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Equations</em>'.
	 * @see textualmcrl2.Eqn#getEquations()
	 * @see #getEqn()
	 * @generated
	 */
	EReference getEqn_Equations();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Equation <em>Equation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equation</em>'.
	 * @see textualmcrl2.Equation
	 * @generated
	 */
	EClass getEquation();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Equation#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see textualmcrl2.Equation#getCondition()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Equation#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see textualmcrl2.Equation#getLeft()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Left();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Equation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.Equation#getRight()
	 * @see #getEquation()
	 * @generated
	 */
	EReference getEquation_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Atom <em>Atom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atom</em>'.
	 * @see textualmcrl2.Atom
	 * @generated
	 */
	EClass getAtom();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Atom#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type</em>'.
	 * @see textualmcrl2.Atom#getType()
	 * @see #getAtom()
	 * @generated
	 */
	EReference getAtom_Type();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ProcessExpr <em>Process Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Expr</em>'.
	 * @see textualmcrl2.ProcessExpr
	 * @generated
	 */
	EClass getProcessExpr();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.AtomicAction <em>Atomic Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Action</em>'.
	 * @see textualmcrl2.AtomicAction
	 * @generated
	 */
	EClass getAtomicAction();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.AtomicAction#getAtomname <em>Atomname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Atomname</em>'.
	 * @see textualmcrl2.AtomicAction#getAtomname()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EAttribute getAtomicAction_Atomname();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.AtomicAction#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.AtomicAction#getLinks()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EReference getAtomicAction_Links();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.AtomicAction#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see textualmcrl2.AtomicAction#getArguments()
	 * @see #getAtomicAction()
	 * @generated
	 */
	EReference getAtomicAction_Arguments();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Deadlock <em>Deadlock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deadlock</em>'.
	 * @see textualmcrl2.Deadlock
	 * @generated
	 */
	EClass getDeadlock();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Tau <em>Tau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tau</em>'.
	 * @see textualmcrl2.Tau
	 * @generated
	 */
	EClass getTau();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Summation <em>Summation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Summation</em>'.
	 * @see textualmcrl2.Summation
	 * @generated
	 */
	EClass getSummation();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Summation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see textualmcrl2.Summation#getParameters()
	 * @see #getSummation()
	 * @generated
	 */
	EReference getSummation_Parameters();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Summation#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see textualmcrl2.Summation#getChild()
	 * @see #getSummation()
	 * @generated
	 */
	EReference getSummation_Child();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see textualmcrl2.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Block#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see textualmcrl2.Block#getChild()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Child();

	/**
	 * Returns the meta object for the attribute list '{@link textualmcrl2.Block#getAtomnames <em>Atomnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atomnames</em>'.
	 * @see textualmcrl2.Block#getAtomnames()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Atomnames();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Block#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Block#getLinks()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Allow <em>Allow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Allow</em>'.
	 * @see textualmcrl2.Allow
	 * @generated
	 */
	EClass getAllow();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Allow#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see textualmcrl2.Allow#getChild()
	 * @see #getAllow()
	 * @generated
	 */
	EReference getAllow_Child();

	/**
	 * Returns the meta object for the attribute list '{@link textualmcrl2.Allow#getAtomnames <em>Atomnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atomnames</em>'.
	 * @see textualmcrl2.Allow#getAtomnames()
	 * @see #getAllow()
	 * @generated
	 */
	EAttribute getAllow_Atomnames();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Allow#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Allow#getLinks()
	 * @see #getAllow()
	 * @generated
	 */
	EReference getAllow_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Hide <em>Hide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hide</em>'.
	 * @see textualmcrl2.Hide
	 * @generated
	 */
	EClass getHide();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Hide#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see textualmcrl2.Hide#getChild()
	 * @see #getHide()
	 * @generated
	 */
	EReference getHide_Child();

	/**
	 * Returns the meta object for the attribute list '{@link textualmcrl2.Hide#getAtomnames <em>Atomnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Atomnames</em>'.
	 * @see textualmcrl2.Hide#getAtomnames()
	 * @see #getHide()
	 * @generated
	 */
	EAttribute getHide_Atomnames();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Hide#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Hide#getLinks()
	 * @see #getHide()
	 * @generated
	 */
	EReference getHide_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Rename <em>Rename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename</em>'.
	 * @see textualmcrl2.Rename
	 * @generated
	 */
	EClass getRename();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Rename#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Child</em>'.
	 * @see textualmcrl2.Rename#getChild()
	 * @see #getRename()
	 * @generated
	 */
	EReference getRename_Child();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Rename#getRenamings <em>Renamings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Renamings</em>'.
	 * @see textualmcrl2.Rename#getRenamings()
	 * @see #getRename()
	 * @generated
	 */
	EReference getRename_Renamings();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Renaming <em>Renaming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Renaming</em>'.
	 * @see textualmcrl2.Renaming
	 * @generated
	 */
	EClass getRenaming();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Renaming#getOldname <em>Oldname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Oldname</em>'.
	 * @see textualmcrl2.Renaming#getOldname()
	 * @see #getRenaming()
	 * @generated
	 */
	EAttribute getRenaming_Oldname();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Renaming#getNewname <em>Newname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Newname</em>'.
	 * @see textualmcrl2.Renaming#getNewname()
	 * @see #getRenaming()
	 * @generated
	 */
	EAttribute getRenaming_Newname();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Renaming#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Renaming#getLinks()
	 * @see #getRenaming()
	 * @generated
	 */
	EReference getRenaming_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Communication <em>Communication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication</em>'.
	 * @see textualmcrl2.Communication
	 * @generated
	 */
	EClass getCommunication();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Communication#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communications</em>'.
	 * @see textualmcrl2.Communication#getCommunications()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Communications();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Communication#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see textualmcrl2.Communication#getAction()
	 * @see #getCommunication()
	 * @generated
	 */
	EReference getCommunication_Action();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.MultiAction <em>Multi Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multi Action</em>'.
	 * @see textualmcrl2.MultiAction
	 * @generated
	 */
	EClass getMultiAction();

	/**
	 * Returns the meta object for the attribute list '{@link textualmcrl2.MultiAction#getActionnames <em>Actionnames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Actionnames</em>'.
	 * @see textualmcrl2.MultiAction#getActionnames()
	 * @see #getMultiAction()
	 * @generated
	 */
	EAttribute getMultiAction_Actionnames();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.MultiAction#getResultname <em>Resultname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resultname</em>'.
	 * @see textualmcrl2.MultiAction#getResultname()
	 * @see #getMultiAction()
	 * @generated
	 */
	EAttribute getMultiAction_Resultname();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.MultiAction#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.MultiAction#getLinks()
	 * @see #getMultiAction()
	 * @generated
	 */
	EReference getMultiAction_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.CompositeAction <em>Composite Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Action</em>'.
	 * @see textualmcrl2.CompositeAction
	 * @generated
	 */
	EClass getCompositeAction();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.CompositeAction#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see textualmcrl2.CompositeAction#getLeft()
	 * @see #getCompositeAction()
	 * @generated
	 */
	EReference getCompositeAction_Left();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Synchronization <em>Synchronization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Synchronization</em>'.
	 * @see textualmcrl2.Synchronization
	 * @generated
	 */
	EClass getSynchronization();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Synchronization#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.Synchronization#getRight()
	 * @see #getSynchronization()
	 * @generated
	 */
	EReference getSynchronization_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.TimedAction <em>Timed Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timed Action</em>'.
	 * @see textualmcrl2.TimedAction
	 * @generated
	 */
	EClass getTimedAction();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.TimedAction#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.TimedAction#getRight()
	 * @see #getTimedAction()
	 * @generated
	 */
	EReference getTimedAction_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see textualmcrl2.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Sequence#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.Sequence#getRight()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Implication <em>Implication</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Implication</em>'.
	 * @see textualmcrl2.Implication
	 * @generated
	 */
	EClass getImplication();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Implication#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see textualmcrl2.Implication#getCondition()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Implication#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see textualmcrl2.Implication#getAction()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_Action();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Implication#getElseAction <em>Else Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else Action</em>'.
	 * @see textualmcrl2.Implication#getElseAction()
	 * @see #getImplication()
	 * @generated
	 */
	EReference getImplication_ElseAction();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.BoundedInitialisation <em>Bounded Initialisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Initialisation</em>'.
	 * @see textualmcrl2.BoundedInitialisation
	 * @generated
	 */
	EClass getBoundedInitialisation();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.BoundedInitialisation#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.BoundedInitialisation#getRight()
	 * @see #getBoundedInitialisation()
	 * @generated
	 */
	EReference getBoundedInitialisation_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Parallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parallelism</em>'.
	 * @see textualmcrl2.Parallelism
	 * @generated
	 */
	EClass getParallelism();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Parallelism#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.Parallelism#getRight()
	 * @see #getParallelism()
	 * @generated
	 */
	EReference getParallelism_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.LeftMerge <em>Left Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Merge</em>'.
	 * @see textualmcrl2.LeftMerge
	 * @generated
	 */
	EClass getLeftMerge();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.LeftMerge#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.LeftMerge#getRight()
	 * @see #getLeftMerge()
	 * @generated
	 */
	EReference getLeftMerge_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see textualmcrl2.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Choice#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.Choice#getRight()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Nameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see textualmcrl2.Nameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Nameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see textualmcrl2.Nameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.DataExpression <em>Data Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Expression</em>'.
	 * @see textualmcrl2.DataExpression
	 * @generated
	 */
	EClass getDataExpression();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Identifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see textualmcrl2.Identifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Identifier#getVarname <em>Varname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Varname</em>'.
	 * @see textualmcrl2.Identifier#getVarname()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Varname();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Identifier#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Identifier#getLinks()
	 * @see #getIdentifier()
	 * @generated
	 */
	EReference getIdentifier_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Number <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number</em>'.
	 * @see textualmcrl2.Number
	 * @generated
	 */
	EClass getNumber();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Number#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see textualmcrl2.Number#getValue()
	 * @see #getNumber()
	 * @generated
	 */
	EAttribute getNumber_Value();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.BooleanLiteral <em>Boolean Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal</em>'.
	 * @see textualmcrl2.BooleanLiteral
	 * @generated
	 */
	EClass getBooleanLiteral();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.BooleanLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see textualmcrl2.BooleanLiteral#isValue()
	 * @see #getBooleanLiteral()
	 * @generated
	 */
	EAttribute getBooleanLiteral_Value();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection</em>'.
	 * @see textualmcrl2.Collection
	 * @generated
	 */
	EClass getCollection();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.SetEnumeration <em>Set Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Enumeration</em>'.
	 * @see textualmcrl2.SetEnumeration
	 * @generated
	 */
	EClass getSetEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.SetEnumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see textualmcrl2.SetEnumeration#getElements()
	 * @see #getSetEnumeration()
	 * @generated
	 */
	EReference getSetEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ListEnumeration <em>List Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>List Enumeration</em>'.
	 * @see textualmcrl2.ListEnumeration
	 * @generated
	 */
	EClass getListEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.ListEnumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see textualmcrl2.ListEnumeration#getElements()
	 * @see #getListEnumeration()
	 * @generated
	 */
	EReference getListEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.BagEnumeration <em>Bag Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Enumeration</em>'.
	 * @see textualmcrl2.BagEnumeration
	 * @generated
	 */
	EClass getBagEnumeration();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.BagEnumeration#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see textualmcrl2.BagEnumeration#getElements()
	 * @see #getBagEnumeration()
	 * @generated
	 */
	EReference getBagEnumeration_Elements();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.BagEnumElement <em>Bag Enum Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Enum Element</em>'.
	 * @see textualmcrl2.BagEnumElement
	 * @generated
	 */
	EClass getBagEnumElement();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.BagEnumElement#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see textualmcrl2.BagEnumElement#getElement()
	 * @see #getBagEnumElement()
	 * @generated
	 */
	EReference getBagEnumElement_Element();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.BagEnumElement#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Quantity</em>'.
	 * @see textualmcrl2.BagEnumElement#getQuantity()
	 * @see #getBagEnumElement()
	 * @generated
	 */
	EReference getBagEnumElement_Quantity();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.FunctionApplication <em>Function Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Application</em>'.
	 * @see textualmcrl2.FunctionApplication
	 * @generated
	 */
	EClass getFunctionApplication();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.FunctionApplication#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see textualmcrl2.FunctionApplication#getBase()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Base();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.FunctionApplication#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see textualmcrl2.FunctionApplication#getArguments()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Arguments();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.FunctionApplication#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.FunctionApplication#getLinks()
	 * @see #getFunctionApplication()
	 * @generated
	 */
	EReference getFunctionApplication_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.MapAccess <em>Map Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Map Access</em>'.
	 * @see textualmcrl2.MapAccess
	 * @generated
	 */
	EClass getMapAccess();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.MapAccess#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see textualmcrl2.MapAccess#getBase()
	 * @see #getMapAccess()
	 * @generated
	 */
	EReference getMapAccess_Base();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.MapAccess#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Key</em>'.
	 * @see textualmcrl2.MapAccess#getKey()
	 * @see #getMapAccess()
	 * @generated
	 */
	EReference getMapAccess_Key();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.MapAccess#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see textualmcrl2.MapAccess#getValue()
	 * @see #getMapAccess()
	 * @generated
	 */
	EReference getMapAccess_Value();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.UnaryExpression <em>Unary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Expression</em>'.
	 * @see textualmcrl2.UnaryExpression
	 * @generated
	 */
	EClass getUnaryExpression();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.UnaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.UnaryExpression#getRight()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EReference getUnaryExpression_Right();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.UnaryExpression#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see textualmcrl2.UnaryExpression#getOperation()
	 * @see #getUnaryExpression()
	 * @generated
	 */
	EAttribute getUnaryExpression_Operation();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Quantification <em>Quantification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantification</em>'.
	 * @see textualmcrl2.Quantification
	 * @generated
	 */
	EClass getQuantification();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Quantification#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see textualmcrl2.Quantification#getExpression()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Quantification#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see textualmcrl2.Quantification#getVariable()
	 * @see #getQuantification()
	 * @generated
	 */
	EReference getQuantification_Variable();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.Quantification#isForall <em>Forall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Forall</em>'.
	 * @see textualmcrl2.Quantification#isForall()
	 * @see #getQuantification()
	 * @generated
	 */
	EAttribute getQuantification_Forall();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.IdDecl <em>Id Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Id Decl</em>'.
	 * @see textualmcrl2.IdDecl
	 * @generated
	 */
	EClass getIdDecl();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.IdDecl#getSort <em>Sort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sort</em>'.
	 * @see textualmcrl2.IdDecl#getSort()
	 * @see #getIdDecl()
	 * @generated
	 */
	EReference getIdDecl_Sort();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.IdDecl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see textualmcrl2.IdDecl#getName()
	 * @see #getIdDecl()
	 * @generated
	 */
	EAttribute getIdDecl_Name();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.BinaryExpression <em>Binary Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Expression</em>'.
	 * @see textualmcrl2.BinaryExpression
	 * @generated
	 */
	EClass getBinaryExpression();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.BinaryExpression#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see textualmcrl2.BinaryExpression#getOperator()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EAttribute getBinaryExpression_Operator();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.BinaryExpression#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left</em>'.
	 * @see textualmcrl2.BinaryExpression#getLeft()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Left();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.BinaryExpression#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right</em>'.
	 * @see textualmcrl2.BinaryExpression#getRight()
	 * @see #getBinaryExpression()
	 * @generated
	 */
	EReference getBinaryExpression_Right();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Lambda <em>Lambda</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lambda</em>'.
	 * @see textualmcrl2.Lambda
	 * @generated
	 */
	EClass getLambda();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Lambda#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see textualmcrl2.Lambda#getExpression()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.Lambda#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see textualmcrl2.Lambda#getVariable()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_Variable();

	/**
	 * Returns the meta object for the reference list '{@link textualmcrl2.Lambda#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Links</em>'.
	 * @see textualmcrl2.Lambda#getLinks()
	 * @see #getLambda()
	 * @generated
	 */
	EReference getLambda_Links();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.WhereClause <em>Where Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Where Clause</em>'.
	 * @see textualmcrl2.WhereClause
	 * @generated
	 */
	EClass getWhereClause();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.WhereClause#getBase <em>Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Base</em>'.
	 * @see textualmcrl2.WhereClause#getBase()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Base();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.WhereClause#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Values</em>'.
	 * @see textualmcrl2.WhereClause#getValues()
	 * @see #getWhereClause()
	 * @generated
	 */
	EReference getWhereClause_Values();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see textualmcrl2.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link textualmcrl2.Process#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see textualmcrl2.Process#getParameters()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Parameters();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ProcessDecl <em>Process Decl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process Decl</em>'.
	 * @see textualmcrl2.ProcessDecl
	 * @generated
	 */
	EClass getProcessDecl();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.ProcessDecl#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see textualmcrl2.ProcessDecl#getAction()
	 * @see #getProcessDecl()
	 * @generated
	 */
	EReference getProcessDecl_Action();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.ProcessDecl#getProcess <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see textualmcrl2.ProcessDecl#getProcess()
	 * @see #getProcessDecl()
	 * @generated
	 */
	EReference getProcessDecl_Process();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ConstraintElement <em>Constraint Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Element</em>'.
	 * @see textualmcrl2.ConstraintElement
	 * @generated
	 */
	EClass getConstraintElement();

	/**
	 * Returns the meta object for the containment reference '{@link textualmcrl2.ConstraintElement#getConstraintvar <em>Constraintvar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraintvar</em>'.
	 * @see textualmcrl2.ConstraintElement#getConstraintvar()
	 * @see #getConstraintElement()
	 * @generated
	 */
	EReference getConstraintElement_Constraintvar();

	/**
	 * Returns the meta object for class '{@link textualmcrl2.ConstraintVar <em>Constraint Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint Var</em>'.
	 * @see textualmcrl2.ConstraintVar
	 * @generated
	 */
	EClass getConstraintVar();

	/**
	 * Returns the meta object for the attribute '{@link textualmcrl2.ConstraintVar#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see textualmcrl2.ConstraintVar#getNumber()
	 * @see #getConstraintVar()
	 * @generated
	 */
	EAttribute getConstraintVar_Number();

	/**
	 * Returns the meta object for enum '{@link textualmcrl2.UnaryOps <em>Unary Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Unary Ops</em>'.
	 * @see textualmcrl2.UnaryOps
	 * @generated
	 */
	EEnum getUnaryOps();

	/**
	 * Returns the meta object for enum '{@link textualmcrl2.BinaryOps <em>Binary Ops</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Binary Ops</em>'.
	 * @see textualmcrl2.BinaryOps
	 * @generated
	 */
	EEnum getBinaryOps();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Textualmcrl2Factory getTextualmcrl2Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SpecificationImpl <em>Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SpecificationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSpecification()
		 * @generated
		 */
		EClass SPECIFICATION = eINSTANCE.getSpecification();

		/**
		 * The meta object literal for the '<em><b>Atoms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__ATOMS = eINSTANCE.getSpecification_Atoms();

		/**
		 * The meta object literal for the '<em><b>Processes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__PROCESSES = eINSTANCE.getSpecification_Processes();

		/**
		 * The meta object literal for the '<em><b>Sorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__SORTS = eINSTANCE.getSpecification_Sorts();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__OPERATIONS = eINSTANCE.getSpecification_Operations();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__EQUATIONS = eINSTANCE.getSpecification_Equations();

		/**
		 * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIFICATION__INIT = eINSTANCE.getSpecification_Init();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIFICATION__NAME = eINSTANCE.getSpecification_Name();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SortImpl <em>Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SortImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSort()
		 * @generated
		 */
		EClass SORT = eINSTANCE.getSort();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ExpressionSortImpl <em>Expression Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ExpressionSortImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getExpressionSort()
		 * @generated
		 */
		EClass EXPRESSION_SORT = eINSTANCE.getExpressionSort();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPRESSION_SORT__EXPRESSION = eINSTANCE.getExpressionSort_Expression();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.StructureSortImpl <em>Structure Sort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.StructureSortImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getStructureSort()
		 * @generated
		 */
		EClass STRUCTURE_SORT = eINSTANCE.getStructureSort();

		/**
		 * The meta object literal for the '<em><b>Constructors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STRUCTURE_SORT__CONSTRUCTORS = eINSTANCE.getStructureSort_Constructors();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SortExprImpl <em>Sort Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SortExprImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSortExpr()
		 * @generated
		 */
		EClass SORT_EXPR = eINSTANCE.getSortExpr();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BoolImpl <em>Bool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BoolImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBool()
		 * @generated
		 */
		EClass BOOL = eINSTANCE.getBool();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.PosImpl <em>Pos</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.PosImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getPos()
		 * @generated
		 */
		EClass POS = eINSTANCE.getPos();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.NatImpl <em>Nat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.NatImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNat()
		 * @generated
		 */
		EClass NAT = eINSTANCE.getNat();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.IntImpl <em>Int</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.IntImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getInt()
		 * @generated
		 */
		EClass INT = eINSTANCE.getInt();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.RealImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ListImpl <em>List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ListImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getList()
		 * @generated
		 */
		EClass LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em><b>Element Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST__ELEMENT_SORT = eINSTANCE.getList_ElementSort();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SetImpl <em>Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SetImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSet()
		 * @generated
		 */
		EClass SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em><b>Element Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET__ELEMENT_SORT = eINSTANCE.getSet_ElementSort();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BagImpl <em>Bag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BagImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBag()
		 * @generated
		 */
		EClass BAG = eINSTANCE.getBag();

		/**
		 * The meta object literal for the '<em><b>Element Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG__ELEMENT_SORT = eINSTANCE.getBag_ElementSort();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SortRefImpl <em>Sort Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SortRefImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSortRef()
		 * @generated
		 */
		EClass SORT_REF = eINSTANCE.getSortRef();

		/**
		 * The meta object literal for the '<em><b>Sortname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_REF__SORTNAME = eINSTANCE.getSortRef_Sortname();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORT_REF__LINKS = eINSTANCE.getSortRef_Links();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORT_REF__SORT = eINSTANCE.getSortRef_Sort();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.HigherOrderImpl <em>Higher Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.HigherOrderImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getHigherOrder()
		 * @generated
		 */
		EClass HIGHER_ORDER = eINSTANCE.getHigherOrder();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHER_ORDER__DOMAIN = eINSTANCE.getHigherOrder_Domain();

		/**
		 * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIGHER_ORDER__RESULT = eINSTANCE.getHigherOrder_Result();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ConstructorImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstructor()
		 * @generated
		 */
		EClass CONSTRUCTOR = eINSTANCE.getConstructor();

		/**
		 * The meta object literal for the '<em><b>Projections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRUCTOR__PROJECTIONS = eINSTANCE.getConstructor_Projections();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRUCTOR__DISCRIMINATOR = eINSTANCE.getConstructor_Discriminator();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ProjectionImpl <em>Projection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ProjectionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProjection()
		 * @generated
		 */
		EClass PROJECTION = eINSTANCE.getProjection();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECTION__DOMAIN = eINSTANCE.getProjection_Domain();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.OpImpl <em>Op</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.OpImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getOp()
		 * @generated
		 */
		EClass OP = eINSTANCE.getOp();

		/**
		 * The meta object literal for the '<em><b>Ops</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OP__OPS = eINSTANCE.getOp_Ops();

		/**
		 * The meta object literal for the '<em><b>Cons</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OP__CONS = eINSTANCE.getOp_Cons();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.EqnImpl <em>Eqn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.EqnImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getEqn()
		 * @generated
		 */
		EClass EQN = eINSTANCE.getEqn();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQN__VARIABLES = eINSTANCE.getEqn_Variables();

		/**
		 * The meta object literal for the '<em><b>Equations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQN__EQUATIONS = eINSTANCE.getEqn_Equations();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.EquationImpl <em>Equation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.EquationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getEquation()
		 * @generated
		 */
		EClass EQUATION = eINSTANCE.getEquation();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__CONDITION = eINSTANCE.getEquation_Condition();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__LEFT = eINSTANCE.getEquation_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUATION__RIGHT = eINSTANCE.getEquation_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.AtomImpl <em>Atom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.AtomImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAtom()
		 * @generated
		 */
		EClass ATOM = eINSTANCE.getAtom();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOM__TYPE = eINSTANCE.getAtom_Type();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ProcessExprImpl <em>Process Expr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ProcessExprImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcessExpr()
		 * @generated
		 */
		EClass PROCESS_EXPR = eINSTANCE.getProcessExpr();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.AtomicActionImpl <em>Atomic Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.AtomicActionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAtomicAction()
		 * @generated
		 */
		EClass ATOMIC_ACTION = eINSTANCE.getAtomicAction();

		/**
		 * The meta object literal for the '<em><b>Atomname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATOMIC_ACTION__ATOMNAME = eINSTANCE.getAtomicAction_Atomname();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION__LINKS = eINSTANCE.getAtomicAction_Links();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATOMIC_ACTION__ARGUMENTS = eINSTANCE.getAtomicAction_Arguments();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.DeadlockImpl <em>Deadlock</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.DeadlockImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getDeadlock()
		 * @generated
		 */
		EClass DEADLOCK = eINSTANCE.getDeadlock();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.TauImpl <em>Tau</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.TauImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getTau()
		 * @generated
		 */
		EClass TAU = eINSTANCE.getTau();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SummationImpl <em>Summation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SummationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSummation()
		 * @generated
		 */
		EClass SUMMATION = eINSTANCE.getSummation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMATION__PARAMETERS = eINSTANCE.getSummation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUMMATION__CHILD = eINSTANCE.getSummation_Child();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BlockImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__CHILD = eINSTANCE.getBlock_Child();

		/**
		 * The meta object literal for the '<em><b>Atomnames</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__ATOMNAMES = eINSTANCE.getBlock_Atomnames();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__LINKS = eINSTANCE.getBlock_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.AllowImpl <em>Allow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.AllowImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getAllow()
		 * @generated
		 */
		EClass ALLOW = eINSTANCE.getAllow();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOW__CHILD = eINSTANCE.getAllow_Child();

		/**
		 * The meta object literal for the '<em><b>Atomnames</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALLOW__ATOMNAMES = eINSTANCE.getAllow_Atomnames();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALLOW__LINKS = eINSTANCE.getAllow_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.HideImpl <em>Hide</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.HideImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getHide()
		 * @generated
		 */
		EClass HIDE = eINSTANCE.getHide();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE__CHILD = eINSTANCE.getHide_Child();

		/**
		 * The meta object literal for the '<em><b>Atomnames</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HIDE__ATOMNAMES = eINSTANCE.getHide_Atomnames();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HIDE__LINKS = eINSTANCE.getHide_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.RenameImpl <em>Rename</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.RenameImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getRename()
		 * @generated
		 */
		EClass RENAME = eINSTANCE.getRename();

		/**
		 * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME__CHILD = eINSTANCE.getRename_Child();

		/**
		 * The meta object literal for the '<em><b>Renamings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAME__RENAMINGS = eINSTANCE.getRename_Renamings();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.RenamingImpl <em>Renaming</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.RenamingImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getRenaming()
		 * @generated
		 */
		EClass RENAMING = eINSTANCE.getRenaming();

		/**
		 * The meta object literal for the '<em><b>Oldname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAMING__OLDNAME = eINSTANCE.getRenaming_Oldname();

		/**
		 * The meta object literal for the '<em><b>Newname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAMING__NEWNAME = eINSTANCE.getRenaming_Newname();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RENAMING__LINKS = eINSTANCE.getRenaming_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.CommunicationImpl <em>Communication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.CommunicationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCommunication()
		 * @generated
		 */
		EClass COMMUNICATION = eINSTANCE.getCommunication();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__COMMUNICATIONS = eINSTANCE.getCommunication_Communications();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION__ACTION = eINSTANCE.getCommunication_Action();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.MultiActionImpl <em>Multi Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.MultiActionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getMultiAction()
		 * @generated
		 */
		EClass MULTI_ACTION = eINSTANCE.getMultiAction();

		/**
		 * The meta object literal for the '<em><b>Actionnames</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_ACTION__ACTIONNAMES = eINSTANCE.getMultiAction_Actionnames();

		/**
		 * The meta object literal for the '<em><b>Resultname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_ACTION__RESULTNAME = eINSTANCE.getMultiAction_Resultname();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MULTI_ACTION__LINKS = eINSTANCE.getMultiAction_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.CompositeActionImpl <em>Composite Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.CompositeActionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCompositeAction()
		 * @generated
		 */
		EClass COMPOSITE_ACTION = eINSTANCE.getCompositeAction();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_ACTION__LEFT = eINSTANCE.getCompositeAction_Left();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SynchronizationImpl <em>Synchronization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SynchronizationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSynchronization()
		 * @generated
		 */
		EClass SYNCHRONIZATION = eINSTANCE.getSynchronization();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYNCHRONIZATION__RIGHT = eINSTANCE.getSynchronization_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.TimedActionImpl <em>Timed Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.TimedActionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getTimedAction()
		 * @generated
		 */
		EClass TIMED_ACTION = eINSTANCE.getTimedAction();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMED_ACTION__RIGHT = eINSTANCE.getTimedAction_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SequenceImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__RIGHT = eINSTANCE.getSequence_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ImplicationImpl <em>Implication</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ImplicationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getImplication()
		 * @generated
		 */
		EClass IMPLICATION = eINSTANCE.getImplication();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__CONDITION = eINSTANCE.getImplication_Condition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__ACTION = eINSTANCE.getImplication_Action();

		/**
		 * The meta object literal for the '<em><b>Else Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPLICATION__ELSE_ACTION = eINSTANCE.getImplication_ElseAction();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BoundedInitialisationImpl <em>Bounded Initialisation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BoundedInitialisationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBoundedInitialisation()
		 * @generated
		 */
		EClass BOUNDED_INITIALISATION = eINSTANCE.getBoundedInitialisation();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_INITIALISATION__RIGHT = eINSTANCE.getBoundedInitialisation_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ParallelismImpl <em>Parallelism</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ParallelismImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getParallelism()
		 * @generated
		 */
		EClass PARALLELISM = eINSTANCE.getParallelism();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARALLELISM__RIGHT = eINSTANCE.getParallelism_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.LeftMergeImpl <em>Left Merge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.LeftMergeImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getLeftMerge()
		 * @generated
		 */
		EClass LEFT_MERGE = eINSTANCE.getLeftMerge();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEFT_MERGE__RIGHT = eINSTANCE.getLeftMerge_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ChoiceImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__RIGHT = eINSTANCE.getChoice_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.NameableImpl <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.NameableImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.DataExpressionImpl <em>Data Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.DataExpressionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getDataExpression()
		 * @generated
		 */
		EClass DATA_EXPRESSION = eINSTANCE.getDataExpression();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.IdentifierImpl <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.IdentifierImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Varname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__VARNAME = eINSTANCE.getIdentifier_Varname();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IDENTIFIER__LINKS = eINSTANCE.getIdentifier_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.NumberImpl <em>Number</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.NumberImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getNumber()
		 * @generated
		 */
		EClass NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER__VALUE = eINSTANCE.getNumber_Value();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BooleanLiteralImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBooleanLiteral()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL__VALUE = eINSTANCE.getBooleanLiteral_Value();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.CollectionImpl <em>Collection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.CollectionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getCollection()
		 * @generated
		 */
		EClass COLLECTION = eINSTANCE.getCollection();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.SetEnumerationImpl <em>Set Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.SetEnumerationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getSetEnumeration()
		 * @generated
		 */
		EClass SET_ENUMERATION = eINSTANCE.getSetEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_ENUMERATION__ELEMENTS = eINSTANCE.getSetEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ListEnumerationImpl <em>List Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ListEnumerationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getListEnumeration()
		 * @generated
		 */
		EClass LIST_ENUMERATION = eINSTANCE.getListEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIST_ENUMERATION__ELEMENTS = eINSTANCE.getListEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BagEnumerationImpl <em>Bag Enumeration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BagEnumerationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBagEnumeration()
		 * @generated
		 */
		EClass BAG_ENUMERATION = eINSTANCE.getBagEnumeration();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ENUMERATION__ELEMENTS = eINSTANCE.getBagEnumeration_Elements();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BagEnumElementImpl <em>Bag Enum Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BagEnumElementImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBagEnumElement()
		 * @generated
		 */
		EClass BAG_ENUM_ELEMENT = eINSTANCE.getBagEnumElement();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ENUM_ELEMENT__ELEMENT = eINSTANCE.getBagEnumElement_Element();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BAG_ENUM_ELEMENT__QUANTITY = eINSTANCE.getBagEnumElement_Quantity();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.FunctionApplicationImpl <em>Function Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.FunctionApplicationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getFunctionApplication()
		 * @generated
		 */
		EClass FUNCTION_APPLICATION = eINSTANCE.getFunctionApplication();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__BASE = eINSTANCE.getFunctionApplication_Base();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__ARGUMENTS = eINSTANCE.getFunctionApplication_Arguments();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_APPLICATION__LINKS = eINSTANCE.getFunctionApplication_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.MapAccessImpl <em>Map Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.MapAccessImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getMapAccess()
		 * @generated
		 */
		EClass MAP_ACCESS = eINSTANCE.getMapAccess();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ACCESS__BASE = eINSTANCE.getMapAccess_Base();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ACCESS__KEY = eINSTANCE.getMapAccess_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAP_ACCESS__VALUE = eINSTANCE.getMapAccess_Value();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.UnaryExpressionImpl <em>Unary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.UnaryExpressionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getUnaryExpression()
		 * @generated
		 */
		EClass UNARY_EXPRESSION = eINSTANCE.getUnaryExpression();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_EXPRESSION__RIGHT = eINSTANCE.getUnaryExpression_Right();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNARY_EXPRESSION__OPERATION = eINSTANCE.getUnaryExpression_Operation();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.QuantificationImpl <em>Quantification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.QuantificationImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getQuantification()
		 * @generated
		 */
		EClass QUANTIFICATION = eINSTANCE.getQuantification();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__EXPRESSION = eINSTANCE.getQuantification_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFICATION__VARIABLE = eINSTANCE.getQuantification_Variable();

		/**
		 * The meta object literal for the '<em><b>Forall</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUANTIFICATION__FORALL = eINSTANCE.getQuantification_Forall();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.IdDeclImpl <em>Id Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.IdDeclImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getIdDecl()
		 * @generated
		 */
		EClass ID_DECL = eINSTANCE.getIdDecl();

		/**
		 * The meta object literal for the '<em><b>Sort</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ID_DECL__SORT = eINSTANCE.getIdDecl_Sort();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ID_DECL__NAME = eINSTANCE.getIdDecl_Name();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.BinaryExpressionImpl <em>Binary Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.BinaryExpressionImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBinaryExpression()
		 * @generated
		 */
		EClass BINARY_EXPRESSION = eINSTANCE.getBinaryExpression();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BINARY_EXPRESSION__OPERATOR = eINSTANCE.getBinaryExpression_Operator();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__LEFT = eINSTANCE.getBinaryExpression_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_EXPRESSION__RIGHT = eINSTANCE.getBinaryExpression_Right();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.LambdaImpl <em>Lambda</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.LambdaImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getLambda()
		 * @generated
		 */
		EClass LAMBDA = eINSTANCE.getLambda();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__EXPRESSION = eINSTANCE.getLambda_Expression();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__VARIABLE = eINSTANCE.getLambda_Variable();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LAMBDA__LINKS = eINSTANCE.getLambda_Links();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.WhereClauseImpl <em>Where Clause</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.WhereClauseImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getWhereClause()
		 * @generated
		 */
		EClass WHERE_CLAUSE = eINSTANCE.getWhereClause();

		/**
		 * The meta object literal for the '<em><b>Base</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_CLAUSE__BASE = eINSTANCE.getWhereClause_Base();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WHERE_CLAUSE__VALUES = eINSTANCE.getWhereClause_Values();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ProcessImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__PARAMETERS = eINSTANCE.getProcess_Parameters();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ProcessDeclImpl <em>Process Decl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ProcessDeclImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getProcessDecl()
		 * @generated
		 */
		EClass PROCESS_DECL = eINSTANCE.getProcessDecl();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DECL__ACTION = eINSTANCE.getProcessDecl_Action();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS_DECL__PROCESS = eINSTANCE.getProcessDecl_Process();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ConstraintElementImpl <em>Constraint Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ConstraintElementImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstraintElement()
		 * @generated
		 */
		EClass CONSTRAINT_ELEMENT = eINSTANCE.getConstraintElement();

		/**
		 * The meta object literal for the '<em><b>Constraintvar</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTRAINT_ELEMENT__CONSTRAINTVAR = eINSTANCE.getConstraintElement_Constraintvar();

		/**
		 * The meta object literal for the '{@link textualmcrl2.impl.ConstraintVarImpl <em>Constraint Var</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.impl.ConstraintVarImpl
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getConstraintVar()
		 * @generated
		 */
		EClass CONSTRAINT_VAR = eINSTANCE.getConstraintVar();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT_VAR__NUMBER = eINSTANCE.getConstraintVar_Number();

		/**
		 * The meta object literal for the '{@link textualmcrl2.UnaryOps <em>Unary Ops</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.UnaryOps
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getUnaryOps()
		 * @generated
		 */
		EEnum UNARY_OPS = eINSTANCE.getUnaryOps();

		/**
		 * The meta object literal for the '{@link textualmcrl2.BinaryOps <em>Binary Ops</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see textualmcrl2.BinaryOps
		 * @see textualmcrl2.impl.Textualmcrl2PackageImpl#getBinaryOps()
		 * @generated
		 */
		EEnum BINARY_OPS = eINSTANCE.getBinaryOps();

	}

} //Textualmcrl2Package
