package StrukturniObrasci.Bridge.Implementacija;

public class RefinedAbstraction extends Abstraction{
    @Override
    public void operation() {
        implementor.operationImp();
    }
}
