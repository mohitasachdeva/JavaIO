import java.io.IOException;
import java.util.List;

public class ConsoleIOServiceImpl implements PayrollService {
    @Override
    public boolean writePayrollData(List<EmployeePayrollData> employeePayrollDataList) throws IOException {
        return false;
    }

    @Override
    public void readPayrollData() throws IOException {

    }

    @Override
    public long countEntries() throws IOException {
        return 0;
    }
}
