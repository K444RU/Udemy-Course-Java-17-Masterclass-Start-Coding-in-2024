package java17masterclass.section11.exercise47;

class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            ListItem currentItem = this.root;
            ListItem parentItem = null;

            while (currentItem != null) {
                int comparison = currentItem.compareTo(item);
                if (comparison == 0) {
                    performRemoval(currentItem, parentItem);
                    return true;
                } else if (comparison < 0) {
                    parentItem = currentItem;
                    currentItem = currentItem.next();
                } else {
                    parentItem = currentItem;
                    currentItem = currentItem.previous();
                }
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            if (parent == null) {
                this.root = null;
            } else if (parent.next() == item) {
                parent.setNext(null);
            } else if (parent.previous() == item) {
                parent.setPrevious(null);
            }
        }
        else if (item.next() != null && item.previous() != null) {
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            item.setValue(current.getValue());
            performRemoval(current, leftmostParent);
        }
        else {
            ListItem child = (item.next() != null) ? item.next() : item.previous();
            if (parent == null) {
                this.root = child;
            } else if (parent.next() == item) {
                parent.setNext(child);
            } else if (parent.previous() == item) {
                parent.setPrevious(child);
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
