package subham.javacode.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import subham.javacode.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
