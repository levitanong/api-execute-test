(ns api-execute-test.rpc
  (:require-macros
    [javelin.core :refer [defc defc=]])
  (:require
   [javelin.core]
   [castra.core :refer [mkremote]]))

(defc state {:random nil})
(defc error nil)
(defc loading [])

(def get-state
  (mkremote 'api-execute-test.api/get-state state error loading))

(defn init []
  (get-state)
  (get-state))
