package StrukturniObrasci.Decorator.Primjer;


public class HSBDecorator extends WindowDecorator {
    public HSBDecorator(Window win) {
        super(win);
    }
    @Override
    public void draw() {
        super.draw();
        drawHSBar();
    }
    private void drawHSBar() {
        System.out.println("drawHSBar");
    }
}
