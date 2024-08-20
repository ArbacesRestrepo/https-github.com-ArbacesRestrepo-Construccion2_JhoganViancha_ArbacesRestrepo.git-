package App.Controllers.Validator;

/**
 *
 * @author arbac
 */


public class PersonValidator extends CommonsValidator {	
    public PersonValidator() {
        super();
    }

    public void validName(String personName) throws Exception{
        super.isValidString("el nombre de la persona ", personName);
    }

    public long validDocument(String document) throws Exception{
        return super.isValidLong("la cédula de la persona ", document);
    }

    public long validCellPhone(String cellPhone) throws Exception{
        return super.isValidLong("la edad de la persona ", cellPhone);
    }
}