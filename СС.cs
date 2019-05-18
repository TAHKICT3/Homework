using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.Linq;

public class СС : MonoBehaviour {

    GameObject []cams;
    int d;
	void Start () {
        d = 0;
        cams = GameObject.FindGameObjectsWithTag("MainCamera");
	}
	
	// Update is called once per frame
	void Update () {
        if (Input.GetKeyDown(KeyCode.M))
            Setactive("MainCamera");
        if (Input.GetKeyDown(KeyCode.N))
            Setactive("Camera");
    }
    private void Setactive(string name)
    {
        d++;
        var o = cams.First(c => c.name == name);
        o.GetComponent<Camera>().depth = d;
    }
}
