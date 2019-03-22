package excepitons;

public class BaseException extends RuntimeException {

    private String description;
    private Class<?> clazz;

    public BaseException(String description, Class<?> clazz) {
        super();
        this.description = description;
        this.clazz = clazz;
    }
}
