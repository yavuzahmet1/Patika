public interface IDatabase<T> {
    public boolean add(T data);

    public boolean delete(T data);

    public boolean edit(T data);

    public T select();

}
