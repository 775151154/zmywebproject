package com.leo.testpro.annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import com.leo.mypro.definedannotation.FieldMeta;
import com.leo.mypro.definedannotation.SortableField;
import com.leo.mypro.vo.Anno;

public class AnnotationTest {
	/**
     * �����Զ���ע��
     * @param args
     */
    public static void main(String[] args) {
    	// �ֶμ���Ӧע�⼯��
    	List<SortableField> list = new ArrayList<SortableField>();
    	
		Anno a = new Anno();
		Field[] field = a.getClass().getDeclaredFields();
		for(Field f : field){
			FieldMeta fieldMeta = f.getAnnotation(FieldMeta.class);
			if(fieldMeta != null){
				System.out.println("id:"+fieldMeta.id()+";name:"+fieldMeta.name()+";description:"+fieldMeta.description()+
						";order:"+fieldMeta.order());
				SortableField sor =new SortableField(fieldMeta, f);
				list.add(sor);
			}
		}
		
		for(SortableField sor : list){
			System.out.println("�ֶΣ�" + sor.getName() + ",�ֶ����ͣ�" + sor.getType() + ",ע�⣺" + "(id:"+sor.getMeta().id()+ ";name:"+
					sor.getMeta().name()+";description:"+sor.getMeta().description()+";order:"+sor.getMeta().order() + ");");
		}
	}
}
