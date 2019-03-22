package excepitons;

public class ArgumentNullException extends BaseException {

    public ArgumentNullException(String description, Class<?> clazz) {
        super(description, clazz);
    }
}
