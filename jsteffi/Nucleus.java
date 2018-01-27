package jsteffi;
import ij.*;
import ij.io.*;
import ij.gui.*;
import ij.measure.*;
import ij.plugin.filter.*;

import java.util.*;

import jsteffi.utilities.*;


public class Nucleus {
	
	public int id;
	public Roi roi;
	
	public Hashtable<String, MutableDouble> geoData;
	public Hashtable<String, MutableDouble[]> intensData;
	
	public Nucleus (int id, Roi roi, Hashtable<String, MutableDouble> geoData) {
		this.id = id;
		this.roi = roi;
		this.geoData = geoData;
		
	}
}