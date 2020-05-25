(ns exercise7)

(defn increment [x]
	( if (list? x)
	    (map inc x)
	 (if (vector? x)
	    (vec (map inc x) )
	  )
	)
)




