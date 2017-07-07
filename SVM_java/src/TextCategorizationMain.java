
import java.io.IOException;


public class TextCategorizationMain  {
	public static void main(String[] args) throws IOException{
	
	//三个参数分别是经过Scale处理的待分类的数据文件，存放分类器模型的文件，存储分类结果的文件
	String modelFile="Data/svmtra_iris.txt.model";
	String scaleFile="Data/opentest/svmtes_iris.txt";
	String predictFile=scaleFile+".predict";
	String argv1[]={scaleFile,modelFile,predictFile};
	SVMPredict predict = new SVMPredict();		
	predict.run(argv1);
	
	
}
	
}
