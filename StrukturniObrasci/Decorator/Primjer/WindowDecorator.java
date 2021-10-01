package StrukturniObrasci.Decorator.Primjer;

public class WindowDecorator implements Window{
    private Window win;

    public WindowDecorator(Window win){
        this.win=win;
    }
    @Override
    public void draw() {
        win.draw();
    }
}
