package org.dxc.mongodb.repository;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.dxc.mongodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmployeeRepository extends MongoRepository<Employee,ObjectId> {

	Optional<Employee> findByEmployeeId(double employeeId);

	void deleteByEmployeeId(double employeeId);

}
