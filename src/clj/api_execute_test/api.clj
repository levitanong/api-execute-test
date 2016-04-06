(ns api-execute-test.api
  (:require [castra.core :refer [defrpc]]))

(println "api called")

(defrpc get-state []
  {})
