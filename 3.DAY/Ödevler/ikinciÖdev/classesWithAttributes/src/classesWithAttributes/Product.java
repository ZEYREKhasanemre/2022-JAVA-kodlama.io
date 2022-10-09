package classesWithAttributes;

public class Product {
	
	public Product(int id,String name, String description,double price,int stockAmount,String renk) {
		System.out.println("yapıcı blok çalıştı");
		this._id=id;
		this._name=name;
		this._description=description;
		this._price=price;
		this._stockAmount=stockAmount;
		this._renk=renk;
	}
	
	public Product() {}

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	public int get_id() {
		return _id;
	}
	public void set_id(int id) {
		this._id = id;
	}
	public String get_name() {
		return _name;
	}
	public void set_name(String name) {
		this._name = name;
	}
	public String get_description() {
		return _description;
	}
	public void set_description(String description) {
		this._description = description;
	}
	public double get_price() {
		return _price;
	}
	public void set_price(double price) {
		this._price = price;
	}
	public int get_stockAmount() {
		return _stockAmount;
	}
	public void set_stockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
	public String get_renk() {
		return _renk;
	}
	public void set_renk(String renk) {
		this._renk = renk;
	}
	public String get_kod() {
		return this._name.substring(0,1) + _id;
	}
	public void set_kod(String kod) {
		this._kod = kod;
	}
	
	
}
