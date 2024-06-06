package libraries;

/**
 * The Class Setup.
 */
public class Setup
{
    /**
     * Instantiates a new setup.
     */
    private Setup()
    {
    }

    /** The Constant LOGS_FOLDER. */
    public static final String LOGS_FOLDER = System.getProperty("folderLogs");

    /** The Constant IMAGES_FOLDER. */
    public static final String IMAGES_FOLDER = System.getProperty("folderImages");

    /** The Constant USER_DIR. */
    public static final String USER_DIR = System.getProperty("user.dir");

    /** The Constant LOGS_FOLDER_PATH. */
    public static final String LOGS_FOLDER_PATH = USER_DIR + "/" + LOGS_FOLDER + "/";

    /** The Constant IMAGES_FOLDER_PATH. */
    public static final String IMAGES_FOLDER_PATH = USER_DIR + "/" + IMAGES_FOLDER + "/";
}
