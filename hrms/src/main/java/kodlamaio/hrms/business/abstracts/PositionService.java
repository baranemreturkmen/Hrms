package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Position;
  

public interface PositionService {
	
	//Bu interface positions tablosuna ait sorguları yazacağım ortak metodları bulundurmaktadır.
	//Bu paketin altında ki diğer interfacelerde başka tablolara ait sorguları yazacağım ortak
	//metodları bulunduracak.
	
	List<Position> getAllPositions();
	
}
