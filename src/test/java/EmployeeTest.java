import org.example.pojo.EmployeeRequest;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

public class EmployeeTest {

    @Test
    public void testEmployeeNameGetter()
    {
        EmployeeRequest employeeRequest = new EmployeeRequest("ayush", "sde-2");
        Assert.notNull(employeeRequest.getName(), "name not null");
    }

    @Test
    public void testEmployeeRoleGetter()
    {
        EmployeeRequest employeeRequest = new EmployeeRequest("ayush", "sde-2");
        Assert.notNull(employeeRequest.getRole(), "name not null");
    }
}
