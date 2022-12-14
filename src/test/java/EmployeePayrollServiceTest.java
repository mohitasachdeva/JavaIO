import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

    public class EmployeePayrollServiceTest {

        @Test
        void given3EmployeesWhenWrittenToFileShouldMatchEmployeeEntries(){
            List<EmployeePayrollData> list = new ArrayList<>();
            EmployeePayrollData employeePayrollData1 = new EmployeePayrollData(1,"Mohita",30000);
            EmployeePayrollData employeePayrollData2 = new EmployeePayrollData(1,"Gagan",3000);
            EmployeePayrollData employeePayrollData3 = new EmployeePayrollData(1,"sapna",10000);
            list.add(employeePayrollData1);
            list.add(employeePayrollData2);
            list.add(employeePayrollData3);
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(list);
            employeePayrollService.writeEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
            employeePayrollService.readEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
            long count = employeePayrollService.countEmployeePayrollData(EmployeePayrollService.IOService.FILE_IO);
            Assertions.assertEquals(3,count);

        }
    }

