import java.util.List;

public interface iMetier <T,U>{
    void add(T  o);
    List getALL();
    T getByID(U id);
    void deleteByID(U id);
}
