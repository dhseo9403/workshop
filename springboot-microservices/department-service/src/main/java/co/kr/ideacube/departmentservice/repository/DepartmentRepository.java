package co.kr.ideacube.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.kr.ideacube.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    Department findByDepartmentCode(String departmentCode);
}
