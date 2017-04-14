package cn.mk95.www.dao;

import cn.mk95.www.bean.NoteEntity;
import cn.mk95.www.interfaces.NoteDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by YangYongHao on 2017/3/29.
 * Annotation:
 */
public class NoteDaoImpl extends BaseDaoHibernate<NoteEntity> implements NoteDao {

    @Override
    public List findNoteByTime(int userid, Date notetime) {
        String hql1="select en from NoteEntity en where en.username="+userid+" and en.notetime like "+notetime+"%";
        List<NoteEntity> noteEntities=find(hql1);
        if(noteEntities.size()==0)
            return null;
        return noteEntities;
    }

    @Override
    public List findNoteByid(int userid) {
        return null;
    }
}
