package ferhats;

import org.springframework.stereotype.Component;

@Component
public class EmployerImpl implements Employer {


    @Override
    public int paySalary(int i) {
        return 8 * 30 * i;
    }
}
