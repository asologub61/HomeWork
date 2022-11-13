package HomeworkException;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class TrianglePlug {
    public InputStream exception() throws FileNotFoundException{
        throw new FileNotFoundException("Произошла ошибка на низком уровне");
    }
}
