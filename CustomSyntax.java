public class CustomSyntax{
	private String statement, condition, block;
	
	public CustomSyntax(){
		this("","","");
	}
	
	public CustomSyntax(String statement, String condition, String block){
		this.statement = statement;
		this.condition = condition;
		this.block = block;
	}
	
	public String getStatement(){return statement;}
	public String getCondition(){return condition;}
	public String getBlock(){return block;}
	public CustomSyntax setStatement(String statement){this.statement = statement; return this;}
	public CustomSyntax setCondition(String condition){this.condition = condition; return this;}
	public CustomSyntax setBlock(String block){this.block = block; return this;}
	
	@Override
	public String toString(){
		return String.format("%s(%s){\n\t%s;\n}", statement, condition, block);
	}
}
