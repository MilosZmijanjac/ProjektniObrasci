package StrukturniObrasci.Decorator.Primjer;

public class VSBDecorator extends WindowDecorator {
    public VSBDecorator(Window win) {
        super(win);
    }
    @Override
    public void draw() {
        super.draw();
        drawVSBar();
    }
    private void drawVSBar() {
        System.out.println("drawVSBar");
    }
}
