package kodlamaio.hrms.business.concretes;

import java.util.List;


import kodlamaio.hrms.business.abstracts.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{
	
	//ÇOK ÖNEMLİ
	//Bu class'ın altında DataAccess katmanındaki PositionDao'ya erişmem gerekiyor.
	//Bu noktada PositionDao'yu bu class'ın altında constructor injection yaparak
	//kullanacağım. Şimdi burada bunu neden böyle kullanıyorum. Constructor injection yaparak
	//PositionDao'ya erişiyorum. PositionDao bir interface ve JpaRepository'i extend ediyor.
	//JpaRepository'i de bir interface. Ortada bir class yok son noktada. Bu durumda JpaRepository
	//arka planda generic olarak çalışıyor yani PositionDao'Da verdiğim 2 parametreye göre spring
	//arka planda bir repository oluşturuyor. Zaten spring arka planda bir tane instance(örnek) oluşturduğu
	//için benim dataAccess katmanımda sadece benim oluşturduğum soyut interfaceler var. dataAccess katmanında
	//somut classları tutan concretes paketim bomboş. Bunu benim için bu şekilde spring yapıyor. Burada constructor
	//injection yapmamın sebebi dataAccess katmanında JpaRepository extend eden bir sürü interface'im var
	//Ben bu classda JpaRepository extend eden hangi interface'i kullanıyorum bana bunun bilgisi gerekli. Bu bilgiyi
	//de bu class için constructor injection yaparak veriyoruz. Fakat tüm bu işlemler yapılırken Autowired anotasyonu 
	//proje içerisinde tüm projeyi tarıyor ve constructor injectionda kullandığımız interface için spring'in arka planda
	//oluşturduğu instance'i tarıyor ve bizim için burada otomatik bir şekilde bulup yerleştiriyor.
	
	//Autowired'i constructor üzerinde kullanmak yerine özellik üzerinde de kullanabilirim ama bunun dezavantajı şu
	//constructor injection için her yeni özellik eklendiğinde tek tek o özelliklerin üzerinide Autowired anostasyonunu
	//yapıştırmalıyım. Bunun yerine bu anotasyonu constructor üzerinde yaparsam constructor injection'da kullandığım
	//tüm özellikler için tek tek Autowired anotasyonunu kullanmama gerek kalmaz.
	
	//Bu class'ın projemizde servis görevi gördüğünü söyleyebilmek adına Service anotasyonunu kullanıyoruz.
	
	//Bu classtaki yapılan yorumlar diğer Manager classlarım için de aynıdır.
	
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
		
	}
	
	//ÇOK ÖNEMLİ
	//Aşağıdaki metodda kullanılan JpaRepository'den gelen List<Position> parametreli metoddur. Farklı yapılar döndüren
	//findAll() metodları JpaRepository'de mevcuttur. Kodlarınız çalışabilmesi adına doğru parametreyi döndüren findAll()
	//metodunu kullanın lütfen.
	
	@Override
	public List<Position> getAllPositions() {
		// TODO Auto-generated method stub
		return this.positionDao.findAll();
	}


}
