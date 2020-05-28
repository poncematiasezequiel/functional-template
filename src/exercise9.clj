(ns exercise9)

(defn word-count [x]
  	(frequencies (clojure.string/split 
  				  (clojure.string/replace  				  	
				   (clojure.string/replace
  	     		 		(clojure.string/lower-case x)
  				 						#"[\,\:\!\&\@\$\%\^\&]" "")
  				  		#"  " " ")			 
  				   #" ")
  	)
)





