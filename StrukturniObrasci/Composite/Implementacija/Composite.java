package StrukturniObrasci.Composite.Implementacija;

import java.util.ArrayList;

public class Composite extends Component {

        private ArrayList<Component> children;

        public Composite(String name) {
            super(name);
            children= new ArrayList();
        }
    @Override
        public  void add(Component component) {
            children.add(component);
        }
    @Override
        public  void remove(Component component) {
            children.remove(component);
        }
    @Override
        public  void display(int depth) {
            System.out.println("-"+depth+name);// Rekurzivni prikaz podelemenata
            for (Component component : children)
                component.display(depth + 2);
        }

}
