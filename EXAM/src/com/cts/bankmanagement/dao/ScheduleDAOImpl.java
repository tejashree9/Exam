package com.cts.bankmanagement.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import com.cts.bankmanagement.entity.ScheduleTraining;
import com.cts.bankmanagement.entity.TrainerInfo;
import com.cts.bankmanagement.vo.TrainerVO;

@Repository("scheduleDAO")
public class ScheduleDAOImpl implements ScheduleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void insert(TrainerVO trainerVO) {

		System.out.println("Inside Dao impl");

		if(!trainerIdExists(trainerVO.getTrainerId())){
			ScheduleTraining scheduleTraining=getScheduleTrainingUsingVO(trainerVO);
			System.out.println(scheduleTraining);
			int ShedulID=(Integer) sessionFactory.getCurrentSession().save(scheduleTraining);
			System.out.println(" "+ShedulID);
		}else{
			TrainerInfo trainerInfo = getTrainerInfoUsingVOObj(trainerVO);
			System.out.println(trainerInfo);
			sessionFactory.getCurrentSession().save(trainerInfo);
			
			ScheduleTraining scheduleTraining=getScheduleTrainingUsingVO(trainerVO);
			System.out.println(scheduleTraining);
			int ShedulID=(Integer) sessionFactory.getCurrentSession().save(scheduleTraining);
			System.out.println(" "+ShedulID);
		}
	}

	private boolean trainerIdExists(int trainerId) {
		Query query=sessionFactory.getCurrentSession().createQuery("from TrainerInfo where trainerId=:trainerId");
		query.setParameter("trainerId", trainerId);
		return CollectionUtils.isEmpty(query.list());
	}

	private ScheduleTraining getScheduleTrainingUsingVO(TrainerVO trainerVO) {
		// TODO Auto-generated method stub
		return new ScheduleTraining(trainerVO.getScheduleId(),trainerVO.getStartDate(),trainerVO.getDuration(),getTrainerInfoUsingVOObj(trainerVO));
	}

	private TrainerInfo getTrainerInfoUsingVOObj(TrainerVO trainerVO) {

		return new TrainerInfo(
				trainerVO.getTrainerId(),
				trainerVO.getTrainerName(),
				trainerVO.getCollegeName(),
				trainerVO.getDomain());
	}

}
