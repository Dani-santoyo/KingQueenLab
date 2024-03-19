package InterfacesDemo.Game;
import java.util.List;

public interface IsSavable {

    // public abstract List<String> write();
    List<String> write();
    void read(List<String> listOfSavedValues);
}
