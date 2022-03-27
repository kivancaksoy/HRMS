package kvnc.hrms.business.abstracts;

import java.util.List;

import kvnc.hrms.core.utilities.results.DataResult;
import kvnc.hrms.core.utilities.results.Result;
import kvnc.hrms.entities.concretes.JobPosition;

public interface JobPositionService {
	DataResult<List<JobPosition>> getAll();
	Result add(JobPosition jobPosition);
}
