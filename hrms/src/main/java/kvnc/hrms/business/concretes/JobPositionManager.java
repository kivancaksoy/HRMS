package kvnc.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kvnc.hrms.business.abstracts.JobPositionService;
import kvnc.hrms.core.utilities.results.DataResult;
import kvnc.hrms.core.utilities.results.Result;
import kvnc.hrms.core.utilities.results.SuccessDataResult;
import kvnc.hrms.core.utilities.results.SuccessResult;
import kvnc.hrms.dataAccess.abstracts.JobPositionDao;
import kvnc.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll()
				, "İş pozisyonları listelendi.");
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu eklendi.");
	}

}
