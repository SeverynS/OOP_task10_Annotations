import com.annotations.Number;
import com.models.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
/*реализуй для начала задачку
по задаче
1.1) создай аннотацию Number
которая в качестве значения будет принимать число
1.2) в анализаторе через рефлексию собери все поля с этой аннотацией у какого-либо объекта
и просто просуммируй

annotation Number

class XXX{
  @Number(value=1)
  private int field1;

 @Number(value=2)
  private int field2;

}

... анализ...
1 + 2 = 3
*/

public class Task1 {
    public static void main(String[] args) {
        int sum = 0;

        Object object = new Test();
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for(Field field : fields) {
                sum += field.getDeclaredAnnotation(Number.class).value();
        }

        System.out.println(String.format("The summary of Number annotations is %s", sum));
    }
}
