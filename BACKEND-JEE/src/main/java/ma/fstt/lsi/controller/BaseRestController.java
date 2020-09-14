package ma.fstt.lsi.controller;

import java.util.List;

public interface BaseRestController<RES,ID>  {
	public List<RES> getAll();
	public RES get(ID id);
	public RES create(RES resource);
	public RES update(ID id, RES resource);
	public void delete(ID id);

}
