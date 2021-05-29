package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position,Integer>{
	
	//Bir interface başka bir interface'i extend eder bu unutulmasın.
	//Burada JpaRepository verdiğimiz veritipi için ki burada verdiğimiz
	//veritipi Entity anotasyonuna sahip Position oluyor. positions tablosu
	//için primarykey'in veritipi ne ise onu vermemiz lazım ki JpaRepository
	//bizim için sorgularımızı hazırlasın. Şuan için positions tablosu ile ilgili
	//Crud operasyonlar hazır. PositionDao yerine PositionRepository olarak
	//da görebilirsin bu interface'i aynı şey.
	//Kısacası JpaRepository'de ilk parametre hangi tabloya sorguları hazırladığımı
	//söylüyor , 2. parametre ise bu sorguların hangi id ile sorguların hazırlanması 
	//gerektiğini söylüyor.
	
	//Dao interfacelerim için de aynı yorumlar geçerlidir.

}
