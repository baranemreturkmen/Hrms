package kodlamaio.hrms.entities.concretes;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="positions")
public class Position {
	
	//Bu class postgresql tarafında oluşturulan positions tablosunu tutmaktadır.
	//Data anotasyonu ile lombok dahil edildi ve getterları setterları default constructor'ı otomatik olarak oluşturdu.
	//Anotayon bir class'ın veya bir metodun çalışma anında bilgisni toplayan yapı. C#'da karşılığı attribute
	//angular karşılığı decorator. 
	//Hibernate yerine Jpa alt yapısını kullanabilmek adına javax.persistance import edildi.
	//Entity anotasyonu ile spring framework'e bu class'ımızın Entity katmanına karşılık geldiğini söylüyoruz.	
	//Entity demek bu class'a veritabanı nesnesi olduğunu söylemek demek. Veritabanında bu class'ın hangi 
	//tabloya karşılık geleceğini söylemek adına Table anotasyonu kullanıyoruz. Class'ımın özelliklerinin 
	//veritabanında kullandığım tablonun hangi kolonuna karşılık geldiğini söylemek adına Column anotasyonu
	//kullanılır. Kolon isimleri tabloda nasılsa burada Column anotasyonu içersinde birebir şekilde girmek önemli
	//Id anotasyonu tabloda ana işlemlerin yapılacağı ve diğer tablolarla haberleşmeyi sağlayan primarykey olan
	//id kolonuna verilir. Bu kolon sayesinde diğer tablolarla bağlantı sağlanır. Github readme dosyasının içerisinde
	//bu bağlantıların ve haberleşmelerin nasıl gerçekleştiği detaylı bir şekilde açıklanmıştır. GeneratedValue 
	//anotasyonu postgresql tarafında id kolonun auto increment olduğunu yani  tablouya her bir veri eklenmesi 
	//id'nin otomatikman birer birer artacağını söylüyor.
		
	//Diğer tabloları tutan classlarım içinde yukarıdaki yorum aynen geçerlidir.
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="position_name")
	private String positionName;
	
	@Column(name="abbreviation_name")
	private String abbreviationName;
	

}
