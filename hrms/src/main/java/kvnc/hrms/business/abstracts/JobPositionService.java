package kvnc.hrms.business.abstracts;

import java.util.List;

import kvnc.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	List<JobPosition> getAll();

}
