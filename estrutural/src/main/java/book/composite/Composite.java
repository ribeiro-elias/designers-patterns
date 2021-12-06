package book.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private List<Component> components= new ArrayList<>();

    public void add(Component component){
        components.add(component);
    }

    public void remove(Component component){
        components.remove(component);
    }

    public Component getChild(Component child){
        return components.stream().filter(component -> component.equals(child)).findFirst().orElseThrow(() -> new IllegalArgumentException("Child not found"));
    }

    @Override
    public Integer sum() {
        return components.stream().map(Component::sum).reduce(0, Integer::sum);
    }
}
