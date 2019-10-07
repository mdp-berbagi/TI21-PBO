package layout;

public class View{

	public View breaker(String BreakerSkin){
		for(int x = 0; x <= 60 ; x++){
			System.out.print(BreakerSkin);
		}
		System.out.println();
		return this;
	}

	public View ptab(String str){
		this.p("\t"+str);
		return this;
	}

	public View h1(String title){
		this
			.h2("- "+title);

		return this;
	}

	public View h2(String title){
		this
			.ln()
			.h3(title);

		return this;
	}

	public View h3(String title){
		this
			.p(title)
			.ln()
			.breaker("=");

		return this;
	}

	//create space
	public View ln(){
		System.out.println();
		return this;
	}

	public View ln(int line){
		for(int x = 1; x < line; x++){
			System.out.println();
		}
		return this;
	}

	//Shorthand Print
	public View p(String x){
		System.out.print(x);
		return this;
	}

	public View p(int x){
		System.out.print(x);
		return this;
	}
}
