package polymorphism.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

// If the child class throws any exception then the parent class must throw the same exception or it's parent class exception -
// (This validation is only for checked exception).

//public class Overridding5 {
//}

class M{
    public void m1() throws Exception{
    }

    public void m2() throws Exception {
    }

    public void m3(){
    }

    public void m4() throws Exception{
    }

    public void m5() throws IOException{
    }

    public void m6() throws IOException{
    }

    public void m7() throws IOException{
    }
}

class N extends M{
    public void m1() throws Exception{
    }

    public void m2(){
    }

//    public void m3() throws Exception(){
//    }

    public void m4() throws IOException{
    }

//    public void m5() throws Exception{
//    }

    public void m6() throws EOFException, FileNotFoundException {

    }

//    public void m6() throws EOFException, FileNotFoundException, SQLException {
//
//    }

    public void m7() throws EOFException, NullPointerException{  // NPE is the non-checked exception(runtime). So,no error
    }

    public static void main(String[] args) throws Exception{
        new N().m7();
    }
}
