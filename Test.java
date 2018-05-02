import netscape.javascript.JSException;
import netscape.javascript.JSObject;

public class Test {

    public static void main(String[] args) {
        JSObject client = new JSObject() {
            @Override
            public Object call(String methodName, Object... args) throws JSException {
                return null;
            }

            @Override
            public Object eval(String s) throws JSException {
                return null;
            }

            @Override
            public Object getMember(String name) throws JSException {
                return null;
            }

            @Override
            public void setMember(String name, Object value) throws JSException {

            }

            @Override
            public void removeMember(String name) throws JSException {

            }

            @Override
            public Object getSlot(int index) throws JSException {
                return null;
            }

            @Override
            public void setSlot(int index, Object value) throws JSException {

            }
        };
    }
}
