package innerClass.CombinationOfClassInterface;

public class ClassInsideInterface {
}

//  This type can be used when the method in the interface has a class as return type or parameter
// If the functionality of a class is closly associated with interface, then it is highly recommended to declare class inside interface
interface EmailService{
    void sendMails(EmailDetails emailDetails);
    class EmailDetails{
        String toList;
        String ccList;
        String subject;
        String body;
    }
}