
import java.io.IOException;


public class TextCategorizationMain  {
	public static void main(String[] args) throws IOException{
	
	//���������ֱ��Ǿ���Scale����Ĵ�����������ļ�����ŷ�����ģ�͵��ļ����洢���������ļ�
	String modelFile="Data/svmtra_iris.txt.model";
	String scaleFile="Data/opentest/svmtes_iris.txt";
	String predictFile=scaleFile+".predict";
	String argv1[]={scaleFile,modelFile,predictFile};
	SVMPredict predict = new SVMPredict();		
	predict.run(argv1);
	
	
}
	
}
