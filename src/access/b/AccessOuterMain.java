package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //default 호출 불가능
        //private 호출 불가능

        data.innerAccess();
    }
}
