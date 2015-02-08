(ns test-static-handler.dev
    (:require
     [test-static-handler.core]
     [figwheel.client :as fw]))

(fw/start {
  :on-jsload (fn []
               ;; (stop-and-start-my app)
               )})
