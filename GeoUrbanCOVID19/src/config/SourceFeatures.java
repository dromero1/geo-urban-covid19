package config;

public final class SourceFeatures {

	/**
	 * Policies database - type column
	 */
	public static final int POLICIES_TYPE_COLUMN = 0;

	/**
	 * Policies database - begin day column
	 */
	public static final int POLICIES_BEGIN_DAY_COLUMN = 1;

	/**
	 * Policies database - end day column
	 */
	public static final int POLICIES_END_DAY_COLUMN = 2;

	/**
	 * Communes database - id column
	 */
	public static final int COMMUNES_ID_COLUMN = 0;

	/**
	 * Communes database - population column
	 */
	public static final int COMMUNES_POPULATION_COLUMN = 2;

	/**
	 * Communes database - stratum 1 share column
	 */
	public static final int COMMUNES_STRATUM_1_SHARE_COLUMN = 3;

	/**
	 * Communes database - stratum 2 share column
	 */
	public static final int COMMUNES_STRATUM_2_SHARE_COLUMN = 4;

	/**
	 * Communes database - stratum 3 share column
	 */
	public static final int COMMUNES_STRATUM_3_SHARE_COLUMN = 5;
	/**
	 * Communes database - stratum 4 share column
	 */
	public static final int COMMUNES_STRATUM_4_SHARE_COLUMN = 6;
	/**
	 * Communes database - stratum 5 share column
	 */
	public static final int COMMUNES_STRATUM_5_SHARE_COLUMN = 7;

	/**
	 * Communes database - stratum 6 share column
	 */
	public static final int COMMUNES_STRATUM_6_SHARE_COLUMN = 8;

	/**
	 * Neighborhoods database - id column
	 */
	public static final int NEIGHBORHOODS_ID_COLUMN = 0;

	/**
	 * Neighborhoods database - commune column
	 */
	public static final int NEIGHBORHOODS_COMMUNE_COLUMN = 1;

	/**
	 * Policy compliance database - stratum column
	 */
	public static final int POLICY_COMPLIANCE_STRATUM_COLUMN = 0;

	/**
	 * Policy compliance database - compliance share column
	 */
	public static final int POLICY_COMPLIANCE_SHARE_COLUMN = 1;

	/**
	 * Private constructor
	 */
	private SourceFeatures() {
		throw new UnsupportedOperationException("Utility class");
	}

}