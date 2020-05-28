(ns exercise10)

(defn open-account []
  {:account 0}
)

(defn close-account [account]
 (dissoc account :account) 
)

(defn get-balance [account]
 (:account account)
)

(defn update-balance [account amount]
  (update account :account + amount)
)
