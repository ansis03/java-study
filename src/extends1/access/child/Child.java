package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {
    public void call(){
        publicValue = 1;
        protectedValue = 1; // 상속관계 or 다른 페키지ㄱ
        // defaultValue = 1;
        // privateValue = 1;
    }
}
